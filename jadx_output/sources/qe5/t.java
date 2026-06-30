package qe5;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f362191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362192e;

    public t(qe5.z zVar, java.lang.String str) {
        this.f362191d = zVar;
        this.f362192e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        qe5.z zVar = this.f362191d;
        if (!zVar.b7()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
        if (com.tencent.mm.pluginsdk.model.t3.l(this.f362192e)) {
            zVar.d7(true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
