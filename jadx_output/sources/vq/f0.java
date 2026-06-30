package vq;

/* loaded from: classes.dex */
public final class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439157d;

    public f0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        this.f439157d = emojiDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f439157d.finish();
        return true;
    }
}
