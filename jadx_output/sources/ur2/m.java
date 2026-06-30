package ur2;

/* loaded from: classes10.dex */
public final class m implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f430403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f430405f;

    public m(ur2.o oVar, java.lang.String str, int i17) {
        this.f430403d = oVar;
        this.f430404e = str;
        this.f430405f = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        qd2.r rVar = qd2.x.f361849a;
        ur2.o oVar = this.f430403d;
        java.lang.String b17 = rVar.b(oVar.f430407d, java.lang.String.valueOf(editable), this.f430404e);
        boolean z17 = b17.length() > 0;
        android.view.View view = oVar.f430417q;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = oVar.f430407d;
        android.widget.TextView textView = oVar.f430418r;
        if (z17) {
            textView.setText(b17);
            textView.setClickable(false);
            textView.setTextColor(appCompatActivity.getColor(com.tencent.mm.R.color.Red_100));
            view.setEnabled(false);
            return;
        }
        int length = editable != null ? editable.length() : 0;
        int i17 = this.f430405f;
        if (length > i17) {
            oVar.f430411h = length;
            textView.setText(appCompatActivity.getString(com.tencent.mm.R.string.ojz, java.lang.Integer.valueOf(i17)));
            textView.setClickable(false);
            textView.setTextColor(appCompatActivity.getColor(com.tencent.mm.R.color.Red_100));
            java.lang.CharSequence subSequence = editable != null ? editable.subSequence(0, i17) : null;
            android.widget.EditText editText = oVar.f430415o;
            editText.setText(subSequence);
            editText.setSelection(i17);
        } else if (oVar.f430411h <= i17 || length != i17) {
            oVar.f430411h = length;
            textView.setClickable(true);
            textView.setText(appCompatActivity.getString(com.tencent.mm.R.string.ewz));
            textView.setTextColor(appCompatActivity.getColor(com.tencent.mm.R.color.Link_100));
        } else {
            oVar.f430411h = length;
        }
        view.setEnabled(length > 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
