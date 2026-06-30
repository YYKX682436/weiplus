package wt1;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f449295a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.card.model.CardInfo f449296b;

    public j() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f449295a = hashMap;
        this.f449296b = null;
        hashMap.clear();
    }

    public java.lang.Object a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.Map map = this.f449295a;
        if (((java.util.HashMap) map).containsKey(str)) {
            return ((java.util.HashMap) map).get(str);
        }
        return null;
    }

    public void b(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((java.util.HashMap) this.f449295a).put(str, obj);
    }
}
