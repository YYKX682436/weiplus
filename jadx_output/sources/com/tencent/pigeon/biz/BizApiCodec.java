package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/biz/BizApiCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class BizApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
    public static final com.tencent.pigeon.biz.BizApiCodec INSTANCE = new com.tencent.pigeon.biz.BizApiCodec();

    private BizApiCodec() {
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public java.lang.Object readValueOfType(byte type, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object readValue = readValue(buffer);
            java.util.List<? extends java.lang.Object> list = readValue instanceof java.util.List ? (java.util.List) readValue : null;
            if (list != null) {
                return com.tencent.pigeon.biz.BizAlbumUrlInfo.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -127) {
            java.lang.Object readValue2 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list2 = readValue2 instanceof java.util.List ? (java.util.List) readValue2 : null;
            if (list2 != null) {
                return com.tencent.pigeon.biz.BizArticleListenContextInfo.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -126) {
            java.lang.Object readValue3 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list3 = readValue3 instanceof java.util.List ? (java.util.List) readValue3 : null;
            if (list3 != null) {
                return com.tencent.pigeon.biz.BizFinderPreloadPigeonInfo.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -125) {
            java.lang.Object readValue4 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list4 = readValue4 instanceof java.util.List ? (java.util.List) readValue4 : null;
            if (list4 != null) {
                return com.tencent.pigeon.biz.BizInteractiveUserInfo.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -124) {
            java.lang.Object readValue5 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list5 = readValue5 instanceof java.util.List ? (java.util.List) readValue5 : null;
            if (list5 != null) {
                return com.tencent.pigeon.biz.BizNotificationTabInfo.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type == -123) {
            java.lang.Object readValue6 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list6 = readValue6 instanceof java.util.List ? (java.util.List) readValue6 : null;
            if (list6 != null) {
                return com.tencent.pigeon.biz.BizPayAlbum.INSTANCE.fromList(list6);
            }
            return null;
        }
        if (type == -122) {
            java.lang.Object readValue7 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list7 = readValue7 instanceof java.util.List ? (java.util.List) readValue7 : null;
            if (list7 != null) {
                return com.tencent.pigeon.biz.Conversation.INSTANCE.fromList(list7);
            }
            return null;
        }
        if (type == -121) {
            java.lang.Object readValue8 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list8 = readValue8 instanceof java.util.List ? (java.util.List) readValue8 : null;
            if (list8 != null) {
                return com.tencent.pigeon.biz.NotifyMsg.INSTANCE.fromList(list8);
            }
            return null;
        }
        if (type == -120) {
            java.lang.Object readValue9 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list9 = readValue9 instanceof java.util.List ? (java.util.List) readValue9 : null;
            if (list9 != null) {
                return com.tencent.pigeon.biz.NotifyTabInfo.INSTANCE.fromList(list9);
            }
            return null;
        }
        if (type == -119) {
            java.lang.Object readValue10 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list10 = readValue10 instanceof java.util.List ? (java.util.List) readValue10 : null;
            if (list10 != null) {
                return com.tencent.pigeon.biz.PersonalCenterGroupInfo.INSTANCE.fromList(list10);
            }
            return null;
        }
        if (type == -118) {
            java.lang.Object readValue11 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list11 = readValue11 instanceof java.util.List ? (java.util.List) readValue11 : null;
            if (list11 != null) {
                return com.tencent.pigeon.biz.PersonalCenterSingleTabInfo.INSTANCE.fromList(list11);
            }
            return null;
        }
        if (type != -117) {
            return super.readValueOfType(type, buffer);
        }
        java.lang.Object readValue12 = readValue(buffer);
        java.util.List<? extends java.lang.Object> list12 = readValue12 instanceof java.util.List ? (java.util.List) readValue12 : null;
        if (list12 != null) {
            return com.tencent.pigeon.biz.PersonalCenterTabInfo.INSTANCE.fromList(list12);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stream, "stream");
        if (obj instanceof com.tencent.pigeon.biz.BizAlbumUrlInfo) {
            stream.write(128);
            writeValue(stream, ((com.tencent.pigeon.biz.BizAlbumUrlInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.BizArticleListenContextInfo) {
            stream.write(129);
            writeValue(stream, ((com.tencent.pigeon.biz.BizArticleListenContextInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.BizFinderPreloadPigeonInfo) {
            stream.write(130);
            writeValue(stream, ((com.tencent.pigeon.biz.BizFinderPreloadPigeonInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.BizInteractiveUserInfo) {
            stream.write(131);
            writeValue(stream, ((com.tencent.pigeon.biz.BizInteractiveUserInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.BizNotificationTabInfo) {
            stream.write(132);
            writeValue(stream, ((com.tencent.pigeon.biz.BizNotificationTabInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.BizPayAlbum) {
            stream.write(133);
            writeValue(stream, ((com.tencent.pigeon.biz.BizPayAlbum) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.Conversation) {
            stream.write(134);
            writeValue(stream, ((com.tencent.pigeon.biz.Conversation) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.NotifyMsg) {
            stream.write(135);
            writeValue(stream, ((com.tencent.pigeon.biz.NotifyMsg) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.NotifyTabInfo) {
            stream.write(136);
            writeValue(stream, ((com.tencent.pigeon.biz.NotifyTabInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz.PersonalCenterGroupInfo) {
            stream.write(137);
            writeValue(stream, ((com.tencent.pigeon.biz.PersonalCenterGroupInfo) obj).toList());
        } else if (obj instanceof com.tencent.pigeon.biz.PersonalCenterSingleTabInfo) {
            stream.write(138);
            writeValue(stream, ((com.tencent.pigeon.biz.PersonalCenterSingleTabInfo) obj).toList());
        } else if (!(obj instanceof com.tencent.pigeon.biz.PersonalCenterTabInfo)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(139);
            writeValue(stream, ((com.tencent.pigeon.biz.PersonalCenterTabInfo) obj).toList());
        }
    }
}
