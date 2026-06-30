package cw1;

/* loaded from: classes12.dex */
public class a3 implements cw1.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f222718a = java.lang.System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f222721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222724g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f222725h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222726i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f222727j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI f222728k;

    public a3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI, android.widget.TextView textView, android.view.View view, long j17, android.view.View view2, android.widget.TextView textView2, android.widget.TextView textView3, com.tencent.mm.ui.widget.dialog.z2 z2Var, android.view.View view3, int i17) {
        this.f222728k = cleanChattingBaseUI;
        this.f222719b = textView;
        this.f222720c = view;
        this.f222721d = j17;
        this.f222722e = view2;
        this.f222723f = textView2;
        this.f222724g = textView3;
        this.f222725h = z2Var;
        this.f222726i = view3;
        this.f222727j = i17;
    }

    public long a(boolean z17, long j17) {
        android.widget.TextView textView = this.f222719b;
        textView.setVisibility(0);
        android.view.View view = this.f222720c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
        long j18 = this.f222721d;
        long j19 = j17 > j18 ? j18 : j17;
        android.widget.TextView textView2 = this.f222724g;
        android.widget.TextView textView3 = this.f222723f;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f222725h;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = this.f222728k;
        if (z17) {
            android.view.View view2 = this.f222722e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.b8k));
            textView2.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.d4c, fp.n0.a(j19), fp.n0.a(j18 - j19)));
            textView.setTextColor(cleanChattingBaseUI.getColor(com.tencent.mm.R.color.abs));
            z2Var.x(0);
            z2Var.y(cleanChattingBaseUI.getString(com.tencent.mm.R.string.f490454vi));
        } else {
            android.view.View view3 = this.f222726i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI$4", "onDone", "(ZJ)J", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setText(cleanChattingBaseUI.getString(this.f222727j == 1 ? com.tencent.mm.R.string.d1e : com.tencent.mm.R.string.d1f));
            textView2.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.f490917d74, fp.n0.a(j19)));
            z2Var.x(1);
            z2Var.y(cleanChattingBaseUI.getString(com.tencent.mm.R.string.d1x));
        }
        java.util.Objects.requireNonNull(z2Var);
        z2Var.F = new v61.a0$$a(z2Var);
        return j19;
    }

    public void b(int i17, int i18) {
        if (i18 <= 0) {
            i18 = 1;
        }
        if (i17 > i18) {
            i17 = i18;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f222718a;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = this.f222728k;
        if (currentTimeMillis > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            this.f222724g.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.d4a, java.lang.Long.valueOf(((((currentTimeMillis / i17) * i18) - currentTimeMillis) / 60000) + 1)));
        }
        this.f222723f.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.b8w, java.lang.Integer.valueOf((i17 * 100) / i18)));
    }
}
