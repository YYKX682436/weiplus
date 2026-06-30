package h93;

/* loaded from: classes11.dex */
public final class i implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h93.k f279705d;

    public i(h93.k kVar) {
        this.f279705d = kVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        java.util.ArrayList K1;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        h93.k kVar = this.f279705d;
        kVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!r26.n0.N(str)) {
            com.tencent.mm.storage.h4 wi6 = b93.r.wi();
            if (wi6 != null && (K1 = wi6.K1(str)) != null) {
                java.util.Iterator it = K1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.tencent.mm.storage.d4) it.next()).field_labelName);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LabelStateUIC", "searchResultStrList: " + arrayList.size());
        }
        for (java.lang.Class cls : h93.k.f279707q) {
            androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((h93.c) pf5.z.f353948a.a(activity).a(cls)).U6(str, r26.n0.N(str) ? null : arrayList);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
