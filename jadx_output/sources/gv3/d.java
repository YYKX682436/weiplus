package gv3;

/* loaded from: classes5.dex */
public final class d extends cv3.h {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout f276112p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout contentView, int i17) {
        super(context, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        this.f276112p = contentView;
    }

    @Override // cv3.c
    public vu3.c a() {
        return new vu3.b(this.f222569d, 0, 2, null);
    }

    @Override // cv3.c
    public void b() {
    }

    @Override // cv3.h
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c() {
        return this.f276112p;
    }

    @Override // cv3.h, com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setOnVisibleChangeCallback(yz5.l lVar) {
        this.f222576i = new gv3.c(lVar, this);
    }
}
