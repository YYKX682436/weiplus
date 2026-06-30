package db5;

/* loaded from: classes8.dex */
public class p9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.VoiceSearchEditText f228472d;

    public p9(com.tencent.mm.ui.base.VoiceSearchEditText voiceSearchEditText) {
        this.f228472d = voiceSearchEditText;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.base.VoiceSearchEditText voiceSearchEditText = this.f228472d;
        if (voiceSearchEditText.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(true, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        voiceSearchEditText.f197730m = true;
        if (voiceSearchEditText.f197727g && voiceSearchEditText.f197728h && voiceSearchEditText.getText().toString().equals("")) {
            if (motionEvent.getX() <= ((voiceSearchEditText.getWidth() - voiceSearchEditText.getPaddingRight()) - voiceSearchEditText.f197724d.getIntrinsicWidth()) - i65.a.b(voiceSearchEditText.f197729i, 25)) {
                voiceSearchEditText.requestFocus();
                if (voiceSearchEditText.getContext() instanceof android.app.Activity) {
                    com.tencent.mm.ui.MMActivity.showVKB((android.app.Activity) voiceSearchEditText.getContext());
                }
                android.view.View.OnClickListener onClickListener = voiceSearchEditText.f197726f;
                if (onClickListener != null) {
                    onClickListener.onClick(null);
                }
            } else if (voiceSearchEditText.f197726f != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSearchEditText", "user clicked voice button");
                if (voiceSearchEditText.getContext() instanceof com.tencent.mm.ui.MMActivity) {
                    ((com.tencent.mm.ui.MMActivity) voiceSearchEditText.getContext()).hideVKB(voiceSearchEditText);
                }
                voiceSearchEditText.f197726f.onClick(voiceSearchEditText);
                yj0.a.i(true, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        } else if (voiceSearchEditText.getText().toString().length() <= 0) {
            android.view.View.OnClickListener onClickListener2 = voiceSearchEditText.f197726f;
            if (onClickListener2 != null) {
                onClickListener2.onClick(null);
            }
        } else if (motionEvent.getX() > ((voiceSearchEditText.getWidth() - voiceSearchEditText.getPaddingRight()) - voiceSearchEditText.f197725e.getIntrinsicWidth()) - i65.a.b(voiceSearchEditText.f197729i, 25)) {
            voiceSearchEditText.setText("");
            voiceSearchEditText.getClass();
            com.tencent.mm.ui.base.VoiceSearchEditText.a(voiceSearchEditText);
        } else if (!voiceSearchEditText.isFocused()) {
            voiceSearchEditText.requestFocus();
            if (voiceSearchEditText.getContext() instanceof android.app.Activity) {
                com.tencent.mm.ui.MMActivity.showVKB((android.app.Activity) voiceSearchEditText.getContext());
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
