package hr3;

/* loaded from: classes11.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f284193f;

    public y0(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI, android.view.View view, java.lang.String str) {
        this.f284193f = contactInfoUI;
        this.f284191d = view;
        this.f284192e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        final java.lang.String str = this.f284192e;
        hr3.o1 o1Var = new hr3.o1() { // from class: hr3.y0$$a
            @Override // hr3.o1
            public final java.lang.Boolean apply(java.lang.Object obj) {
                android.view.View view = (android.view.View) obj;
                if (view.getId() != com.tencent.mm.R.id.m7k) {
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.valueOf((view.findViewById(android.R.id.title) instanceof android.widget.TextView) && ((android.widget.TextView) view.findViewById(android.R.id.title)).getText().equals(str));
            }
        };
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f284193f;
        android.view.View X6 = contactInfoUI.X6(this.f284191d, o1Var);
        if (X6 == null || X6.isAccessibilityFocused() || java.lang.System.currentTimeMillis() - contactInfoUI.Q <= 0) {
            return;
        }
        contactInfoUI.Q = java.lang.System.currentTimeMillis();
        X6.sendAccessibilityEvent(128);
    }
}
