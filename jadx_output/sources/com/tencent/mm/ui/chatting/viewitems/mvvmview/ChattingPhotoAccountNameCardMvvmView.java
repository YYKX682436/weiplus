package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingPhotoAccountNameCardMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/z;", "", "getUsername", "()Ljava/lang/String;", dm.i4.COL_USERNAME, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingPhotoAccountNameCardMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.z> {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204632f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingPhotoAccountNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getUsername() {
        u05.a aVar;
        z01.z viewModel = getViewModel();
        if (viewModel != null && (aVar = viewModel.f469192d) != null) {
            java.lang.String fromUsername = aVar.getFromUsername();
            if (fromUsername == null || r26.n0.N(fromUsername)) {
                fromUsername = aVar.getUsername();
            }
            if (fromUsername != null) {
                return fromUsername;
            }
        }
        return "";
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView r17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).r(context);
        this.f204632f = r17;
        return r17;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b1  */
    @Override // com.tencent.mm.mvvm.MvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r9, q31.p r10) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingPhotoAccountNameCardMvvmView.e(q31.p, q31.p):void");
    }

    public final boolean h() {
        u05.a aVar;
        z01.z viewModel = getViewModel();
        if (viewModel == null || (aVar = viewModel.f469192d) == null) {
            return false;
        }
        int n17 = aVar.n();
        java.util.Set set = c01.e2.f37117a;
        return com.tencent.mm.storage.z3.D3(n17);
    }

    public final boolean i() {
        z01.z viewModel = getViewModel();
        if (viewModel == null || viewModel.f469192d == null) {
            return false;
        }
        if (!com.tencent.mm.storage.z3.m4(getUsername())) {
            if (!((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(getUsername())) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ ChattingPhotoAccountNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingPhotoAccountNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
