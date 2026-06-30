package com.tencent.mm.plugin.magicbrush.core.event;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static yz5.p f147895a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f147896b;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f147896b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckLanguageChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.magicbrush.core.event.MagicBrushMainProcessEvent$checkLanguageChangeListener$1
            {
                this.__eventId = -1187832230;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckLanguageChangeEvent checkLanguageChangeEvent) {
                com.tencent.mm.autogen.events.CheckLanguageChangeEvent event = checkLanguageChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mars.xlog.Log.i("MagicBrushMainProcessEvent", "checkLanguageChangeIListener language:%s", f17);
                yz5.p pVar = com.tencent.mm.plugin.magicbrush.core.event.a.f147895a;
                if (pVar == null) {
                    return true;
                }
                cl0.g gVar = new cl0.g();
                gVar.h(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, f17);
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                pVar.invoke("onLanguageChange", gVar2);
                return true;
            }
        };
    }
}
