package p61;

/* loaded from: classes.dex */
public class c2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p61.d2 f352227a;

    public c2(p61.d2 d2Var) {
        this.f352227a = d2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            p61.d2 d2Var = this.f352227a;
            java.lang.String className = d2Var.f352233d.getContext().getComponentName().getClassName();
            if (className.startsWith("com.tencent.mm.plugin.account")) {
                className = className.substring("com.tencent.mm.plugin.account".length());
            }
            o05.l lVar = (o05.l) i95.n0.c(o05.l.class);
            androidx.appcompat.app.AppCompatActivity context = d2Var.f352233d.getContext();
            ps4.g gVar = (ps4.g) lVar;
            gVar.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", className);
            bundle.putString("realname_verify_process_jump_plugin", "account");
            gVar.Bi(context, bundle);
        }
    }
}
