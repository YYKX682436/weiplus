package yt3;

/* loaded from: classes10.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.b2 f465340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(yt3.b2 b2Var) {
        super(0);
        this.f465340d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(this.f465340d.f465366r.getDir("webview", 0));
        sb6.append(j17 != null ? j17.o() : null);
        sb6.append("/mmscreenshotedit.png");
        return sb6.toString();
    }
}
