package n34;

@j95.b
/* loaded from: classes4.dex */
public class v4 extends i95.w implements p94.s0 {
    public com.tencent.mm.protocal.protobuf.TimeLineObject Ai(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserFromXml", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        com.tencent.mm.protocal.protobuf.TimeLineObject q17 = m21.y.q(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserFromXml", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        return q17;
    }

    public void Bi(long j17, android.widget.ImageView imageView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = W0.getTimeLine();
        if (timeLine.ContentObj.f369840h.size() > 0) {
            r45.jj4 jj4Var = (r45.jj4) timeLine.ContentObj.f369840h.get(0);
            android.graphics.Bitmap s17 = com.tencent.mm.plugin.sns.model.l4.hj().s(jj4Var);
            if (s17 != null) {
                imageView.setImageBitmap(s17);
            } else {
                com.tencent.mm.plugin.sns.model.l4.hj().Z(W0.getSnsId(), jj4Var, imageView, i17, com.tencent.mm.storage.s7.f195307k);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
    }

    public boolean wi(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return false;
        }
        if (W0.getTimeLine().ContentObj.f369840h.size() > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        return false;
    }
}
