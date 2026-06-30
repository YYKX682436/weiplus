package hw2;

/* loaded from: classes5.dex */
public final class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.w f285575d;

    public v(hw2.w wVar) {
        this.f285575d = wVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1371L, 195L, (2 & 2) != 0 ? 1L : 0L, false);
        android.content.Context context = this.f285575d.f285576g.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).Z6();
    }
}
