package ej4;

/* loaded from: classes11.dex */
public final class l implements qi4.b {
    @Override // qi4.b
    public void L3(java.lang.String event, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "TextStatusStorage notify " + event + ", " + str);
        ej4.c0.d(ej4.c0.f253335a, event, str, false, 4, null);
    }
}
