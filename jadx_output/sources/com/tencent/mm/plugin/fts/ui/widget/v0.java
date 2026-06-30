package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.w0 f138335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f138336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.fts.ui.widget.w0 w0Var, android.content.Context context) {
        super(0);
        this.f138335d = w0Var;
        this.f138336e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fts.ui.widget.x0 voiceInputDrawable;
        com.tencent.mm.plugin.fts.ui.widget.x0 voiceInputDrawable2;
        com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = (com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl) this.f138335d.findViewById(com.tencent.mm.R.id.ggi);
        android.content.Context context = this.f138336e;
        if (fTSVoiceInputLayoutImpl != null && (voiceInputDrawable2 = fTSVoiceInputLayoutImpl.getVoiceInputDrawable()) != null) {
            voiceInputDrawable2.f138349e = i65.a.d(context, com.tencent.mm.R.color.aaq);
        }
        if (fTSVoiceInputLayoutImpl != null && (voiceInputDrawable = fTSVoiceInputLayoutImpl.getVoiceInputDrawable()) != null) {
            voiceInputDrawable.f138346b = i65.a.i(context, com.tencent.mm.R.drawable.c68);
        }
        if (fTSVoiceInputLayoutImpl != null) {
            fTSVoiceInputLayoutImpl.setActivity(context instanceof android.app.Activity ? (android.app.Activity) context : null);
        }
        if (fTSVoiceInputLayoutImpl != null) {
            fTSVoiceInputLayoutImpl.invalidate();
        }
        return fTSVoiceInputLayoutImpl;
    }
}
