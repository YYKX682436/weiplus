package e00;

/* loaded from: classes9.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.y f245829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e00.y yVar) {
        super(0);
        this.f245829d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        e00.y yVar = this.f245829d;
        sb6.append(yVar.f245830a);
        sb6.append("_NativeAppMsgCard_");
        sb6.append(yVar.f245831b.x());
        sb6.append('_');
        sb6.append(yVar.f245832c);
        return com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
    }
}
