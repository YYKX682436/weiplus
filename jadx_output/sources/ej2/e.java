package ej2;

/* loaded from: classes10.dex */
public final class e implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f253293d;

    public e(ej2.j jVar) {
        this.f253293d = jVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        android.text.Editable text;
        ej2.j jVar = this.f253293d;
        android.widget.EditText editText = jVar.f253302e;
        java.lang.String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj == null || obj.length() == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = jVar.f253306i;
            if (weImageView == null) {
                return;
            }
            weImageView.setVisibility(8);
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = jVar.f253306i;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        if (obj == null) {
            jVar.getClass();
            return;
        }
        java.util.ArrayList arrayList = jVar.f253310m;
        arrayList.clear();
        java.util.ArrayList arrayList2 = jVar.f253309l;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            km2.q qVar = ((vi2.i) next).f437552d;
            if (((qVar == null || (str = qVar.f309173d) == null) ? -1 : r26.n0.L(str, obj, 0, false, 6, null)) != -1) {
                arrayList3.add(next);
            }
        }
        arrayList.addAll(arrayList3);
        com.tencent.mars.xlog.Log.i(jVar.f253300c, "loadSearchData keyword:" + obj + " size:" + arrayList.size());
        jVar.a().notifyDataSetChanged();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
