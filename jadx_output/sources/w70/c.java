package w70;

/* loaded from: classes12.dex */
public final class c implements r70.b {
    @Override // r70.b
    public void K3(r70.c event) {
        c01.h7 a17;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f393075b == r70.d.f393085f) {
            c01.h7 h7Var = event.f393074a.f393103e.f304656o;
            if (h7Var != null && (a17 = c01.i7.a(h7Var)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgIncrementalCleanFSC", "[sendFirstMsg] trigger incremental clean for original message id: " + a17.f37227b + ", talker: " + a17.f37229d);
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(a17.f37227b), a17.f37229d);
            }
            a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
            r70.e eVar = event.f393080g;
            java.lang.Long valueOf = eVar != null ? java.lang.Long.valueOf(eVar.f393087a) : null;
            r70.e eVar2 = event.f393080g;
            ((t02.e) iVar).mj(valueOf, eVar2 != null ? eVar2.f393088b : null);
        }
    }
}
