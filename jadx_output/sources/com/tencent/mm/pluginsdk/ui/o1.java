package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class o1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText f190912d;

    public o1(com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText) {
        this.f190912d = mMPhoneNumberEditText;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText = this.f190912d;
        if (mMPhoneNumberEditText.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 1 && motionEvent.getX() > (mMPhoneNumberEditText.getWidth() - mMPhoneNumberEditText.getPaddingRight()) - mMPhoneNumberEditText.f189777d.getIntrinsicWidth()) {
            if (mMPhoneNumberEditText.isFocused()) {
                mMPhoneNumberEditText.setText("");
                mMPhoneNumberEditText.setCompoundDrawablesWithIntrinsicBounds(mMPhoneNumberEditText.getCompoundDrawables()[0], mMPhoneNumberEditText.getCompoundDrawables()[1], (android.graphics.drawable.Drawable) null, mMPhoneNumberEditText.getCompoundDrawables()[3]);
            } else {
                com.tencent.mm.pluginsdk.ui.r1 r1Var = mMPhoneNumberEditText.f189778e;
                if (r1Var != null) {
                    com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) r1Var;
                    if (mMPhoneNumberEditText.f189779f) {
                        db5.e1.j(profileEditPhoneNumberView.getContext(), com.tencent.mm.R.string.fwc, 0, com.tencent.mm.R.string.fwb, com.tencent.mm.R.string.fwa, new com.tencent.mm.pluginsdk.ui.d2(profileEditPhoneNumberView, mMPhoneNumberEditText), null);
                    } else {
                        mMPhoneNumberEditText.setText("");
                        com.tencent.mm.pluginsdk.ui.h2 h2Var = profileEditPhoneNumberView.f189809m;
                        if (h2Var != null) {
                            h2Var.onChange();
                        }
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
