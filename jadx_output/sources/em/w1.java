package em;

/* loaded from: classes10.dex */
public class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254886a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper f254887b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254888c;

    public w1(android.view.View view) {
        this.f254886a = view;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView a() {
        if (this.f254888c == null) {
            this.f254888c = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254886a.findViewById(com.tencent.mm.R.id.lqa);
        }
        return this.f254888c;
    }
}
