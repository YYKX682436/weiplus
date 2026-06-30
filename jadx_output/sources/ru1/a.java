package ru1;

/* loaded from: classes13.dex */
public final class a implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ru1.e f399703a;

    public a(ru1.e eVar) {
        this.f399703a = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastAudioEncoder", "onRecError state is in " + i17);
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        if (bArr != null) {
            ru1.e eVar = this.f399703a;
            eVar.getClass();
            try {
                yz5.l lVar = eVar.f399707a;
                if (lVar != null) {
                    lVar.invoke(bArr);
                }
                com.tencent.mm.vfs.y6 y6Var = eVar.f399710d;
                if (y6Var != null) {
                    y6Var.write(bArr);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastAudioEncoder", "error write to local");
            }
        }
    }
}
