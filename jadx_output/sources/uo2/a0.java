package uo2;

/* loaded from: classes2.dex */
public abstract class a0 {
    public static final java.lang.String a(r45.zi2 zi2Var) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(zi2Var, "<this>");
        boolean z17 = true;
        if (zi2Var.getInteger(11) == 1) {
            java.lang.String string2 = zi2Var.getString(0);
            if (string2 != null && string2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                string = null;
            } else {
                string = "Listen_" + zi2Var.getString(0);
            }
        } else if (zi2Var.getInteger(11) >= 2) {
            string = zi2Var.getInteger(11) + '_' + zi2Var.getString(0);
        } else {
            string = zi2Var.getString(0);
        }
        com.tencent.mars.xlog.Log.i("FinderMusicExt", "doc_type:" + zi2Var.getInteger(11) + " docId:" + zi2Var.getString(0) + " groupId:" + string);
        return string;
    }
}
