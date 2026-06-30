package com.tencent.mm.plugin.recordvideo.ui.editor.music.component.base;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/base/AbsMusicPickerAutoRegisterComponentLayout;", "Landroid/widget/RelativeLayout;", "Lfv3/b;", "Lfv3/c;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getPluginList", "()Ljava/util/ArrayList;", "pluginList", "", "isAttached", "Z", "()Z", "setAttached", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class AbsMusicPickerAutoRegisterComponentLayout extends android.widget.RelativeLayout implements fv3.b, fv3.c {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.util.ArrayList pluginList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsMusicPickerAutoRegisterComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.pluginList = new java.util.ArrayList();
    }

    public final fv3.b b(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        for (fv3.b bVar : this.pluginList) {
            if (kotlin.jvm.internal.o.b(bVar.name(), clazz.getName()) || clazz.isAssignableFrom(bVar.getClass())) {
                return bVar;
            }
        }
        return null;
    }

    public final java.util.ArrayList<fv3.b> getPluginList() {
        return this.pluginList;
    }

    public void m() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((fv3.b) it.next()).m();
        }
    }

    public final void setAttached(boolean z17) {
    }
}
