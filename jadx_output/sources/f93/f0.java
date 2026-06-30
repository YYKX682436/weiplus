package f93;

/* loaded from: classes11.dex */
public final class f0 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260333d;

    public f0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260333d = contactEditLabel;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        int intValue;
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260333d;
        f93.y yVar = contactEditLabel.A;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        java.util.HashMap hashMap = yVar.f260511o;
        if (hashMap.get(str) == null) {
            intValue = -1;
        } else {
            java.lang.Object obj = hashMap.get(str);
            kotlin.jvm.internal.o.d(obj);
            intValue = ((java.lang.Number) obj).intValue();
        }
        if (intValue != -1) {
            android.widget.ListView listView = contactEditLabel.f143210z;
            if (listView != null) {
                listView.setSelection(intValue);
            } else {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
        }
    }
}
