package ki2;

/* loaded from: classes10.dex */
public final class i extends gi2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f308115b = jz5.h.b(ki2.f.f308110d);

    @Override // gi2.c
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView) {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent = (com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView) liveCustomRoomLayoutView;
        kotlin.jvm.internal.o.g(viewList, "viewList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(parent, "parent");
    }

    @Override // gi2.c
    public java.lang.String d() {
        return "KtvRoomCompactLayout";
    }

    @Override // gi2.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        ki2.h hVar = new ki2.h(this, parent);
        if (parent.getWidth() == 0 || parent.getHeight() == 0) {
            parent.getViewTreeObserver().addOnPreDrawListener(new ki2.g(parent, hVar));
        } else {
            hVar.invoke();
        }
    }
}
