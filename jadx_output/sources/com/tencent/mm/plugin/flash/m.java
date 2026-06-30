package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f137228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f137229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashProcessLayout f137230f;

    public m(com.tencent.mm.plugin.flash.FaceFlashProcessLayout faceFlashProcessLayout, boolean z17, org.json.JSONObject jSONObject) {
        this.f137230f = faceFlashProcessLayout;
        this.f137228d = z17;
        this.f137229e = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f137228d;
        com.tencent.mm.plugin.flash.FaceFlashProcessLayout faceFlashProcessLayout = this.f137230f;
        if (z17) {
            faceFlashProcessLayout.f137041d.Y6();
        } else {
            faceFlashProcessLayout.f137041d.U6(this.f137229e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
