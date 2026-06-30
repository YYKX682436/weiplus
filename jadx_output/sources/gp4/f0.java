package gp4;

/* loaded from: classes10.dex */
public final class f0 implements zu3.f {

    /* renamed from: a, reason: collision with root package name */
    public float f274403a;

    /* renamed from: b, reason: collision with root package name */
    public float f274404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f274405c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f274406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274407e;

    public f0(android.content.Context context, com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        this.f274407e = timeEditorItemContainer;
        this.f274405c = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // zu3.f
    public void a(android.view.View itemView, android.view.MotionEvent event) {
        gp4.m timeEditIcon;
        gp4.m timeEditIcon2;
        gp4.m timeEditIcon3;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274407e;
        if (actionMasked == 0) {
            this.f274403a = event.getX();
            this.f274404b = event.getY();
            this.f274406d = false;
            timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.I);
            timeEditorItemContainer.q(itemView, true);
            yz5.l timeEditMenuChangeListener = timeEditorItemContainer.getTimeEditMenuChangeListener();
            if (timeEditMenuChangeListener != null) {
                timeEditMenuChangeListener.invoke(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float abs = java.lang.Math.abs(event.getX() - this.f274403a);
                int i17 = this.f274405c;
                if (abs > i17 || java.lang.Math.abs(event.getY() - this.f274404b) > i17) {
                    this.f274406d = true;
                    int i18 = com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer.L;
                    timeEditorItemContainer.getClass();
                    timeEditIcon3 = timeEditorItemContainer.getTimeEditIcon();
                    timeEditIcon3.setVisibility(4);
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        if (timeEditorItemContainer.f175963x != null) {
            timeEditorItemContainer.post(new gp4.e0(timeEditorItemContainer));
            return;
        }
        if (timeEditorItemContainer.f175964y != null) {
            timeEditIcon = timeEditorItemContainer.getTimeEditIcon();
            if (timeEditIcon.getVisibility() == 0 && (timeEditorItemContainer.f175964y instanceof zu3.b0)) {
                timeEditIcon2 = timeEditorItemContainer.getTimeEditIcon();
                yz5.a editContentListener = timeEditIcon2.getEditContentListener();
                if (editContentListener != null) {
                    editContentListener.invoke();
                    return;
                }
                return;
            }
            if (!this.f274406d) {
                com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer.i(timeEditorItemContainer, itemView, true);
                return;
            }
            timeEditorItemContainer.q(timeEditorItemContainer.f175964y, false);
            yz5.l timeEditMenuChangeListener2 = timeEditorItemContainer.getTimeEditMenuChangeListener();
            if (timeEditMenuChangeListener2 != null) {
                timeEditMenuChangeListener2.invoke(java.lang.Boolean.FALSE);
            }
        }
    }
}
