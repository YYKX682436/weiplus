package cp4;

/* loaded from: classes8.dex */
public final class u implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f221081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp4.x f221082e;

    public u(cp4.x xVar) {
        this.f221082e = xVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable != null) {
            r45.is isVar = (r45.is) this.f221082e.f221090e.get(this.f221081d);
            byte[] bytes = editable.toString().getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            isVar.f377297d = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
