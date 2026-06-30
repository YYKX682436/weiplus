package em;

/* loaded from: classes5.dex */
public class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254313a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254314b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f254315c;

    public f3(android.view.View view) {
        this.f254313a = view;
    }

    public com.tencent.mm.ui.widget.MMTextView a() {
        if (this.f254314b == null) {
            this.f254314b = (com.tencent.mm.ui.widget.MMTextView) this.f254313a.findViewById(com.tencent.mm.R.id.keyboard_desc);
        }
        return this.f254314b;
    }
}
