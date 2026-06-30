package eo5;

/* loaded from: classes.dex */
public final class c implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eo5.e f255594a;

    public c(eo5.e eVar) {
        this.f255594a = eVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.content.Intent intent2;
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        eo5.e eVar = this.f255594a;
        androidx.appcompat.app.AppCompatActivity activity = eVar.getActivity();
        android.content.Intent intent3 = eVar.getActivity().getIntent();
        if (intent3 != null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            kotlin.jvm.internal.o.d(stringExtra);
            kz5.h0.w(arrayList, r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
            intent2 = intent3.putStringArrayListExtra("Select_Contact", arrayList);
        } else {
            intent2 = null;
        }
        activity.setResult(-1, intent2);
        eVar.getActivity().finish();
    }
}
