package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class NoiseDetectMaskView extends android.widget.RelativeLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f176181h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f176182d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f176183e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f176184f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.voiceprint.ui.h f176185g;

    public NoiseDetectMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f176182d = null;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489349c81, this);
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.p6i)).getPaint());
        this.f176182d = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.f486153kd2);
        this.f176183e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486152kd1);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f486154kd3);
        this.f176184f = button;
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView.f176181h;
                com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView noiseDetectMaskView = com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView.this;
                noiseDetectMaskView.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", noiseDetectMaskView, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", noiseDetectMaskView, array2);
                com.tencent.mm.plugin.voiceprint.ui.h hVar = noiseDetectMaskView.f176185g;
                if (hVar != null) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11390, 5);
                    int i18 = com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.F;
                    ((com.tencent.mm.plugin.voiceprint.ui.r) hVar).f176272a.b7();
                }
                yj0.a.h(noiseDetectMaskView, "com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(noiseDetectMaskView, "com/tencent/mm/plugin/voiceprint/ui/NoiseDetectMaskView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public void setOnClickRetryCallback(com.tencent.mm.plugin.voiceprint.ui.h hVar) {
        this.f176185g = hVar;
    }
}
