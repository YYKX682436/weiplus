package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class rj extends java.util.HashMap {
    public rj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        put("msg_svr_id", java.lang.String.valueOf(erVar.c().I0()));
        put("template_id", chattingItemDyeingTemplate.H);
        put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, chattingItemDyeingTemplate.N);
        j31.c cVar = chattingItemDyeingTemplate.X;
        put("content", cVar.f297374f);
        put("template_type", java.lang.String.valueOf(chattingItemDyeingTemplate.P));
        put("container_type", java.lang.String.valueOf(chattingItemDyeingTemplate.W0()));
        put("jump_type", java.lang.String.valueOf(cVar.f297375g));
        put("jump_info", cVar.f297376h);
    }
}
