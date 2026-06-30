package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/BaseMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/base/AbsMusicPickerAutoRegisterComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/j0;", "Lcv3/d;", "e", "Lcv3/d;", "getMusicPickerDrawer", "()Lcv3/d;", "setMusicPickerDrawer", "(Lcv3/d;)V", "musicPickerDrawer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.base.AbsMusicPickerAutoRegisterComponentLayout implements com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public cv3.d musicPickerDrawer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final cv3.d getMusicPickerDrawer() {
        return this.musicPickerDrawer;
    }

    public final void setMusicPickerDrawer(cv3.d dVar) {
        this.musicPickerDrawer = dVar;
    }
}
