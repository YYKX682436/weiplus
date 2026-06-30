package ui4;

/* loaded from: classes11.dex */
public final class a implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.TouchableLayout f428114a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f428115b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f428116c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMProcessBar f428117d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f428118e;

    public a(com.tencent.mm.view.TouchableLayout touchableLayout, androidx.recyclerview.widget.RecyclerView recyclerView, android.widget.TextView textView, com.tencent.mm.ui.widget.MMProcessBar mMProcessBar, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, com.tencent.mm.view.TouchableLayout touchableLayout2) {
        this.f428114a = touchableLayout;
        this.f428115b = recyclerView;
        this.f428116c = textView;
        this.f428117d = mMProcessBar;
        this.f428118e = refreshLoadMoreLayout;
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f428114a;
    }
}
