package xj1;

/* loaded from: classes7.dex */
public final class m implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454807a;

    public m(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f454807a = appBrandCollectionDisplayVerticalList;
    }

    @Override // db5.a1
    public final boolean onFinish(java.lang.CharSequence charSequence) {
        java.lang.String obj;
        if (charSequence != null && (obj = charSequence.toString()) != null) {
            xj1.l lVar = xj1.l.f454806d;
            int i17 = com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.f89638t;
            this.f454807a.getClass();
            if (!(obj.length() == 0)) {
                lVar.invoke(obj);
            }
        }
        return true;
    }
}
