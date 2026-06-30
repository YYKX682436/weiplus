package qe5;

/* loaded from: classes12.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f362165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f362166e;

    public p(qe5.z zVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f362165d = zVar;
        this.f362166e = appCompatActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.lang.String str;
        com.tencent.mm.storage.f9 f9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$firstTimeOpenListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        qe5.z zVar = this.f362165d;
        kd5.e V6 = zVar.V6();
        boolean z17 = false;
        if (V6 != null && V6.f306884o) {
            kd5.e V62 = zVar.V6();
            if (V62 == null || (str = V62.f306893x) == null) {
                str = "";
            }
            kd5.e V63 = zVar.V6();
            java.lang.String str2 = V63 != null ? V63.F : null;
            kd5.e V64 = zVar.V6();
            java.lang.String str3 = V64 != null ? V64.f306892w : null;
            ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
            if (com.tencent.mm.pluginsdk.model.t3.l(str)) {
                zVar.d7(true);
            } else {
                kd5.e V65 = zVar.V6();
                if (V65 != null) {
                    V65.f306876J = true;
                }
                kd5.e V66 = zVar.V6();
                int i17 = V66 != null ? V66.f306878f : 1;
                j75.f Q6 = zVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new kd5.l(str2 != null ? str2 : "", str, i17, str3));
                }
                z17 = true;
            }
            j75.f Q62 = zVar.Q6();
            if (Q62 != null) {
                kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209727o);
                nVar.f306906e = z17;
                nVar.f306907f = true;
                Q62.B3(nVar);
            }
        } else {
            androidx.appcompat.app.AppCompatActivity activity = this.f362166e;
            kotlin.jvm.internal.o.g(activity, "activity");
            if (((com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC.class)).W6()) {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = zVar.P6();
                if (P6 != null) {
                    P6.finish();
                }
                yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$firstTimeOpenListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            kd5.e V67 = zVar.V6();
            if (V67 != null && (f9Var = V67.f306877e) != null) {
                sc5.g gVar = sc5.g.f406572a;
                android.app.Activity context = zVar.getContext();
                kd5.e V68 = zVar.V6();
                sc5.g.g(gVar, context, f9Var, false, false, V68 != null ? V68.f306886q : null, 12, null);
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = zVar.P6();
                if (P62 != null) {
                    P62.finish();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$firstTimeOpenListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
