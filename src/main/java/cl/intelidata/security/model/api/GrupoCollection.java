package cl.intelidata.security.model.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class GrupoCollection implements Serializable {
    private long idEmpresa;
    private List<String> groups = new ArrayList<>();
}
