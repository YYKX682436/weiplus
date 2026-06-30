package mm2;

/* loaded from: classes3.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(r45.i30 i30Var) {
        kotlin.jvm.internal.o.g(i30Var, "<this>");
        return "url: " + i30Var.getString(0) + " duration: " + i30Var.getLong(2) + " md5: " + i30Var.getString(1);
    }

    public final java.lang.String b(r45.nn1 nn1Var) {
        kotlin.jvm.internal.o.g(nn1Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cheer_button_url: ");
        sb6.append(nn1Var.getString(1));
        sb6.append(" enable: ");
        sb6.append(nn1Var.getBoolean(2));
        sb6.append(" landscape_resource: ");
        r45.i30 i30Var = (r45.i30) nn1Var.getCustom(3);
        sb6.append(i30Var != null ? a(i30Var) : null);
        sb6.append(" resource: ");
        r45.i30 i30Var2 = (r45.i30) nn1Var.getCustom(4);
        sb6.append(i30Var2 != null ? a(i30Var2) : null);
        sb6.append(" resource_id: ");
        sb6.append(nn1Var.getLong(6));
        sb6.append(" total_duration: ");
        sb6.append(nn1Var.getLong(7));
        sb6.append(" color: ");
        sb6.append(nn1Var.getList(5));
        return sb6.toString();
    }
}
