package jt3;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jt3.h f301617d;

    public c(jt3.h hVar) {
        this.f301617d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = this.f301617d.f301634f;
        kotlin.jvm.internal.o.f(map, "access$getViewMap$p(...)");
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout) ((java.util.Map.Entry) it.next()).getValue()).onDetach();
        }
    }
}
