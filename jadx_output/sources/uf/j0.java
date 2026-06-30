package uf;

/* loaded from: classes7.dex */
public final class j0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427036a;

    public j0(java.lang.String str) {
        this.f427036a = str;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "seek fail");
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "seek to " + this.f427036a + " success");
    }
}
