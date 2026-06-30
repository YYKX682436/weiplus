package gq5;

/* loaded from: classes5.dex */
public final class f extends com.tencent.mm.sdk.platformtools.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f274625a;

    public f(java.lang.String str) {
        this.f274625a = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void b(com.tencent.mm.sdk.platformtools.a7 controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        java.lang.String str = this.f274625a;
        if (str != null) {
            com.tencent.mm.vfs.w6.h(str);
        }
    }
}
