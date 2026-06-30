package wr3;

/* loaded from: classes11.dex */
public final class v extends wr3.f0 {

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f448898x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.ref.WeakReference f448899y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f448900z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, java.lang.String bizUsername, boolean z17, int i17, long j17, boolean z18, sr3.g config, com.tencent.mm.storage.z3 contact, final androidx.lifecycle.y lifecycleOwner) {
        super(context, bizUsername, z17, i17, j17, z18, config, contact);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f448898x = jz5.h.b(wr3.t.f448878d);
        this.f448899y = new java.lang.ref.WeakReference(this);
        this.f448900z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(lifecycleOwner) { // from class: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioAdapter$tingPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                wr3.v vVar = this;
                wr3.v vVar2 = (wr3.v) vVar.f448899y.get();
                if (vVar2 == null) {
                    return false;
                }
                int i18 = event.f54512g.f7036b;
                ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) vVar.f448898x).getValue()).post(new wr3.u(vVar2));
                return false;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    @Override // wr3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(androidx.recyclerview.widget.k3 r25, int r26) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wr3.v.L(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // wr3.f0
    public wr3.c0 N(wr3.n0 status, r45.s5 message, int i17) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(message, "message");
        return new wr3.s(status, message, i17);
    }

    @Override // wr3.f0
    public androidx.recyclerview.widget.k3 O(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e3c, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new yr3.c1(this, inflate, this.f448784s.g());
    }

    @Override // wr3.f0
    public int P() {
        return 1;
    }

    @Override // wr3.f0
    public int Q() {
        return 2;
    }

    @Override // wr3.f0
    public int R() {
        return 0;
    }
}
