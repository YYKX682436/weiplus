package p61;

/* loaded from: classes5.dex */
public class p1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactUI f352345d;

    public p1(com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI) {
        this.f352345d = bindMContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI = this.f352345d;
        sb6.append(bindMContactUI.f72989i.getText().toString().trim());
        d71.d dVar = bindMContactUI.f72997t;
        java.lang.String phoneNum = bindMContactUI.f72985e.getText().toString();
        dVar.getClass();
        kotlin.jvm.internal.o.g(phoneNum, "phoneNum");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\D");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(phoneNum).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        sb6.append(replaceAll);
        java.lang.String sb7 = sb6.toString();
        bindMContactUI.f72990m = sb7;
        if (sb7.length() > 0) {
            java.lang.String obj = bindMContactUI.f72985e.getText().toString();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (obj.replaceAll("[\\.\\-]", "").trim().length() > 0) {
                bindMContactUI.a7(bindMContactUI.f72990m);
                return true;
            }
        }
        db5.e1.i(bindMContactUI, com.tencent.mm.R.string.agr, com.tencent.mm.R.string.f490573yv);
        return true;
    }
}
