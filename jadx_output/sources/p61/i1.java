package p61;

/* loaded from: classes5.dex */
public class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f352288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352290f;

    public i1(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI, int i17, java.lang.String str) {
        this.f352290f = bindMContactIntroUI;
        this.f352288d = i17;
        this.f352289e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352290f;
        bindMContactIntroUI.f72974t = !bindMContactIntroUI.f72974t;
        android.widget.TextView textView = bindMContactIntroUI.f72962e;
        java.lang.String string = bindMContactIntroUI.getString(this.f352288d);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = bindMContactIntroUI.f72974t ? bindMContactIntroUI.f72969o : this.f352289e;
        textView.setText(java.lang.String.format(string, objArr));
        bindMContactIntroUI.f72965h.setText(bindMContactIntroUI.getString(bindMContactIntroUI.f72974t ? com.tencent.mm.R.string.agi : com.tencent.mm.R.string.agy));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
