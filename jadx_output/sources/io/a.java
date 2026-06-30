package io;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f293164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v05.b f293165e;

    public a(java.lang.String str, v05.b bVar) {
        this.f293164d = str;
        this.f293165e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingAppBrandNativeView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str2 = this.f293164d;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str2;
        v05.b bVar = this.f293165e;
        s05.d dVar = (s05.d) bVar.getCustom(bVar.f432315e + 39);
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        nxVar.f7467b = str;
        startAppBrandUIFromOuterEvent.e();
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingAppBrandNativeView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
