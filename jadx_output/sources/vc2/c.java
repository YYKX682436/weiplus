package vc2;

/* loaded from: classes15.dex */
public class c extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager f435237n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager flowLayoutManager, android.content.Context context) {
        super(context);
        this.f435237n = flowLayoutManager;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 android.graphics.PointF, still in use, count: 2, list:
          (r1v0 android.graphics.PointF) from 0x00f5: PHI (r1v1 android.graphics.PointF) = (r1v0 android.graphics.PointF), (r1v3 android.graphics.PointF) binds: [B:25:0x00d4, B:34:0x015d] A[DONT_GENERATE, DONT_INLINE]
          (r1v0 android.graphics.PointF) from 0x0045: MOVE (r16v8 android.graphics.PointF) = (r1v0 android.graphics.PointF)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int r22) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vc2.c.a(int):android.graphics.PointF");
    }
}
