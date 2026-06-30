package com.tencent.mm.ui.base.preference;

/* loaded from: classes3.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.KeyValuePreference f197855d;

    public w(com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference) {
        this.f197855d = keyValuePreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/preference/KeyValuePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = this.f197855d;
        keyValuePreference.f197772f.a(keyValuePreference);
        yj0.a.h(this, "com/tencent/mm/ui/base/preference/KeyValuePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
