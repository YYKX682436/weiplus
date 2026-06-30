package uh;

/* loaded from: classes12.dex */
public class a extends wh.c2 {
    @Override // wh.c2
    public java.lang.Object a() {
        java.lang.String s17 = wh.m.s();
        return s17.contains(":") ? s17.substring(s17.lastIndexOf(":") + 1) : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
    }
}
