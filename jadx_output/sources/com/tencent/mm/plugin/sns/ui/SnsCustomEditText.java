package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class SnsCustomEditText extends com.tencent.mm.ui.widget.cedit.api.MMCustomEditText {
    public static final /* synthetic */ int V2 = 0;
    public int S2;
    public boolean T2;
    public int U2;

    public SnsCustomEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S2 = 0;
        this.T2 = false;
        this.U2 = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        addTextChangedListener(new com.tencent.mm.plugin.sns.ui.vh(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
    }

    @Override // com.tencent.mm.ui.widget.cedit.api.MMCustomEditText, com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact, com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public boolean c0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        if (i17 == 16908322) {
            this.T2 = true;
        }
        boolean c07 = super.c0(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        return c07;
    }

    @Override // com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact, fl5.i
    public int getPasterLen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        int i17 = this.S2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        return i17;
    }

    @Override // com.tencent.mm.ui.widget.cedit.api.MMCustomEditText, fl5.i
    public fl5.i getRealEditText() {
        return this;
    }

    @Override // com.tencent.mm.ui.widget.cedit.api.MMCustomEditText, fl5.i
    public void setPasterLen(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        this.S2 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
    }
}
