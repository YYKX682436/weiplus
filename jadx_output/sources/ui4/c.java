package ui4;

/* loaded from: classes11.dex */
public final class c implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.TouchableLayout f428126a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f428127b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f428128c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMProcessBar f428129d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f428130e;

    public c(com.tencent.mm.view.TouchableLayout touchableLayout, androidx.recyclerview.widget.RecyclerView recyclerView, android.widget.TextView textView, com.tencent.mm.ui.widget.MMProcessBar mMProcessBar, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, com.tencent.mm.view.TouchableLayout touchableLayout2) {
        this.f428126a = touchableLayout;
        this.f428127b = recyclerView;
        this.f428128c = textView;
        this.f428129d = mMProcessBar;
        this.f428130e = refreshLoadMoreLayout;
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f428126a;
    }
}
