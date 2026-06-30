package gp4;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274437d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        super(1);
        this.f274437d = timeEditorItemContainer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yz5.l itemChangeListener = this.f274437d.getItemChangeListener();
        if (itemChangeListener != null) {
            itemChangeListener.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
