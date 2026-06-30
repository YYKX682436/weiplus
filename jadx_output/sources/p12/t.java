package p12;

/* loaded from: classes10.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f351049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f351050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f351051f;

    public t(p12.w wVar, long j17, android.graphics.Bitmap bitmap) {
        this.f351049d = wVar;
        this.f351050e = j17;
        this.f351051f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = this.f351049d.f351055h;
        if (emojiEditorTrimView == null) {
            kotlin.jvm.internal.o.o("trimView");
            throw null;
        }
        java.util.List list = emojiEditorTrimView.F;
        boolean z17 = list instanceof java.util.Collection;
        long j17 = this.f351050e;
        if (!z17 || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(((o12.h0) it.next()).f342154a == j17)) {
                    break;
                }
            }
        }
        int size = emojiEditorTrimView.F.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((o12.h0) emojiEditorTrimView.F.get(i17)).f342154a == j17) {
                ((o12.h0) emojiEditorTrimView.F.get(i17)).f342155b = this.f351051f;
                emojiEditorTrimView.I.notifyItemChanged(i17);
            }
        }
    }
}
