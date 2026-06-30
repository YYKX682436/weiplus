package qe5;

/* loaded from: classes12.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC f362179d;

    public q1(com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC filePreviewUIC) {
        this.f362179d = filePreviewUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePreviewUIC$initFilePreviewBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC filePreviewUIC = this.f362179d;
        com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC.T6(filePreviewUIC);
        j75.f Q6 = filePreviewUIC.Q6();
        if (Q6 != null) {
            kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209723h);
            nVar.f306904c = false;
            Q6.B3(nVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePreviewUIC$initFilePreviewBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
