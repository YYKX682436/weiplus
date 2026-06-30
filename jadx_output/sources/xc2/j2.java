package xc2;

/* loaded from: classes2.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.q f453170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(gx2.q qVar) {
        super(0);
        this.f453170d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gx2.q qVar = this.f453170d;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = qVar != null ? (com.tencent.mm.ui.widget.listview.PullDownListView) qVar.findViewById(android.R.id.list) : null;
        return java.lang.Boolean.valueOf(pullDownListView == null || !pullDownListView.canScrollVertically(-1));
    }
}
