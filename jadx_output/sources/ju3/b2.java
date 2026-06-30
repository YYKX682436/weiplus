package ju3;

/* loaded from: classes10.dex */
public final /* synthetic */ class b2 extends kotlin.jvm.internal.m implements yz5.l {
    public b2(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.class, "onStopRecord", "onStopRecord(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        ct0.b p07 = (ct0.b) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout = (com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout) this.receiver;
        int i17 = com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.f155834x;
        recordPluginLayout.getClass();
        java.util.Objects.toString(p07);
        nu3.i iVar = nu3.i.f340218a;
        at0.n nVar = recordPluginLayout.recordController;
        boolean z17 = false;
        iVar.n("KEY_MEDIA_SOURCE_INT", java.lang.Integer.valueOf(nVar != null && nVar.f13598f ? 2 : 1));
        int i18 = p07.f222208e - p07.f222207d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = recordPluginLayout.configProvider;
        int i19 = recordConfigProvider != null ? recordConfigProvider.f155686x : 0;
        if (recordConfigProvider != null && recordConfigProvider.F == 14) {
            at0.n nVar2 = recordPluginLayout.recordController;
            if (nVar2 != null) {
                ht0.b bVar = nVar2.f13595c;
                str = bVar != null ? bVar.getFilePath() : null;
                if (str == null) {
                    str = "";
                }
            } else {
                str = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "music scene stop duration not enough, videoPath:" + str + ", fileExist:" + com.tencent.mm.vfs.w6.j(str));
            dw3.c0.f244182a.s(str);
            if (i18 >= i19 || i19 <= 0) {
                it3.y yVar = recordPluginLayout.f155844t;
                if (yVar != null) {
                    ((jt3.h) yVar).e(2, p07);
                }
            } else {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = recordPluginLayout.configProvider;
                int i27 = recordConfigProvider2 != null ? recordConfigProvider2.f155686x : 1000;
                yt3.r3 r3Var = recordPluginLayout.recordPlugin;
                android.content.Context context = r3Var.f465628f.getContext();
                db5.e1.y(context, context.getString(com.tencent.mm.R.string.hu8, java.lang.Integer.valueOf((int) (i27 / 1000.0f))), "", context.getString(com.tencent.mm.R.string.f492781hu3), yt3.p3.f465597d);
                at0.n nVar3 = recordPluginLayout.recordController;
                if (nVar3 != null) {
                    nVar3.e();
                }
                r3Var.reset();
            }
        } else {
            it3.y yVar2 = recordPluginLayout.f155844t;
            if (yVar2 != null) {
                ((jt3.h) yVar2).e(2, p07);
            }
        }
        rs0.p pVar = rs0.p.f399310a;
        java.lang.String str2 = p07.f222204a;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = recordPluginLayout.configProvider;
        pVar.a(str2, recordConfigProvider3 != null ? recordConfigProvider3.f155672g : 1, recordConfigProvider3 != null ? recordConfigProvider3.f155671f : -1);
        java.lang.String str3 = p07.f222204a;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = recordPluginLayout.configProvider;
        di3.x.g(str3, recordConfigProvider4 != null ? recordConfigProvider4.f155672g : 1, recordConfigProvider4 != null ? recordConfigProvider4.F : -1);
        com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct = nu3.i.f340221d;
        storyDoPublishStruct.f60875j = p07.f222208e - p07.f222207d;
        at0.n nVar4 = recordPluginLayout.recordController;
        if (nVar4 != null && nVar4.f13598f) {
            z17 = true;
        }
        storyDoPublishStruct.f60876k = z17 ? 2L : 1L;
        nu3.m.f340229a.d(nVar4 != null ? nVar4.f13612t : null);
        return jz5.f0.f302826a;
    }
}
