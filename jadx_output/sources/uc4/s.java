package uc4;

/* loaded from: classes4.dex */
public final class s extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.v f426451e;

    public s(android.content.Context context, uc4.v vVar) {
        this.f426450d = context;
        this.f426451e = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r1.f170561i == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r2.m(r7) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r10.add(0, 11, 0, r5.getString(com.tencent.mm.R.string.f490359sr));
     */
    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.ContextMenu r10, android.view.View r11, android.view.ContextMenu.ContextMenuInfo r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc4.s.a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
        kotlin.jvm.internal.o.g(view, "view");
        uc4.v vVar = this.f426451e;
        xc4.p c17 = vVar.c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
            return false;
        }
        vVar.e().e(view, c17.W0(), c17.h1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
        return true;
    }
}
