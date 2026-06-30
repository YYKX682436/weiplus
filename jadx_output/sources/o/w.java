package o;

/* loaded from: classes15.dex */
public class w extends android.widget.FrameLayout implements n.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.CollapsibleActionView f341826d;

    /* JADX WARN: Multi-variable type inference failed */
    public w(android.view.View view) {
        super(view.getContext());
        this.f341826d = (android.view.CollapsibleActionView) view;
        addView(view);
    }

    @Override // n.c
    public void b() {
        this.f341826d.onActionViewCollapsed();
    }

    @Override // n.c
    public void d() {
        this.f341826d.onActionViewExpanded();
    }
}
