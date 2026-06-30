package ky;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yz5.l lVar) {
        super(1);
        this.f313417d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context it = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(it);
        this.f313417d.invoke(weImageView);
        return weImageView;
    }
}
